package com.wjc;


import com.wjc.paint.draw;
import org.antlr.v4.runtime.ANTLRInputStream;
import com.wjc.grammar.*;
import com.wjc.info.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class testfo {
    public static void main(String[] args) throws IOException, InterruptedException {
        int bd = 20;
        String sourceFileName = "ccsl.txt";
        String ccslspec =  readSourceCode(sourceFileName);
        pccslLexer lexer = new pccslLexer(CharStreams.fromString(ccslspec));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        pccslParser parser = new pccslParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTree tree = parser.cons();
        mypccslListener cb = new mypccslListener();
        walker.walk(cb,tree);
        cb.pt();
        z3pycode genCode = new z3pycode(cb.clocks,cb.constraints,bd);
        genCode.pt();
        String z3_pycode = genCode.getpycode();

        String filePath="test.py";
        FileOutputStream fos = new FileOutputStream(filePath);
        fos.write(z3_pycode.getBytes());
        fos.close();
        String cmd ="python .\\test.py";
        Process p = Runtime.getRuntime().exec(cmd);
        p.waitFor();
        paint("traces.txt",genCode.ck_num);

    }
    public static void paint(String tracesfilepath,int ck_num){
        String[] ck = new String[ck_num];
        String[] traces = new String[ck_num];

        // 读取文件内容public String readFile(){
        File file = new File(tracesfilepath);
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));//构造一个BufferedReader类来读取文件
            String s = br.readLine();
            if(s.equals("unsat"))
            {
                System.out.println("no schedule");
                draw d = new draw(null,null);
                return;
            }
            br.close();
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            int i =0;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                String part[] = s.split(": ");
                System.out.print(part[0]+": ");
                ck[i] = part[0];
                for (char tick: part[1].toCharArray()) {
                    System.out.print(tick+" ");
                }
                traces[i] = part[1];
                System.out.println();
                i++;
                }
            br.close();
            draw d = new draw(ck,traces);

            } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }



    }



    private static String readSourceCode(String sourceFileName) {
        File sourceFile = new File(sourceFileName);
        StringBuilder codeBuffer = new StringBuilder();
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFile), StandardCharsets.UTF_8))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                codeBuffer.append(line).append("\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return codeBuffer.toString();
    }

}
