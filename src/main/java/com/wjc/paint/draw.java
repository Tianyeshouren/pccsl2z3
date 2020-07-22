package com.wjc.paint;

import javax.swing.*;
import java.awt.*;

public class draw extends JFrame {

    private Graphics jg;
    int trace_len ;
    int ck_num ;
    int width =300 ;
    int height =200;
    int inter_left =1;
    int linewidth=50;
    int lineheight=20;
    int inter = 50; // 每一次tick的线的宽度



    private Color rectColor = new Color(0xf5f5f5);

    /**
     * DrawSee构造方法
     */
    public draw(String [] ck,String[] trace) {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        if(ck == null)
        {
            setBounds((d.width-width)/2, (d.height-height)/2, width,height);
            setVisible(true);
            jg = this.getGraphics();
            jg.setFont(new Font("Times New Roman", Font.BOLD, 30));
            jg.drawString("No Schedule",70,120);


        }else {
            trace_len = trace[0].length();
            ck_num = ck.length;
            width = (trace_len + inter_left + 2) * linewidth;
            height = (ck_num + 2) * 100;
            Container p = getContentPane();
            setBounds((d.width - width) / 2, (d.height - height) / 2, width, height);
            setVisible(true);
            p.setBackground(rectColor);
            setLayout(null);
            setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }

            // 获取专门用于在窗口界面上绘图的对象
            jg = this.getGraphics();
            // 绘制游戏区域
            //System.out.println("pp");
            paintComponents(jg, ck, trace);
        }

    }
    public void paintComponents(Graphics g,String [] ck,String[] trace) {
        try {
            // 设置线条颜色为红色
            g.setColor(Color.BLACK);
            g.setFont(new Font("Times New Roman", Font.BOLD, 14));
            FontMetrics metrics = g.getFontMetrics();
            // 绘制外层矩形框

            //g.drawRect(sx, sy, rw, rw);


            /* 绘制水平10个，垂直10个方格。
             * 即水平方向9条线，垂直方向9条线，
             * 外围四周4条线已经画过了，不需要再画。
             * 同时内部64个方格填写数字。
             */
            for(int j = 1; j <=trace_len ; j ++) {
                g.drawRect((j+inter_left)*50,120,50,40);
                String lt = Integer.toString(j);
                g.drawString(lt,(j+inter_left)*50+25-(metrics.stringWidth(lt))/2,145);
                //g.drawLine(j*50,120,j*50,160);

            }

            for(int i = 0;i<ck.length;i++)
            {
                int state = 0;
                int cury = (i+2)*100;

                g.setColor(Color.BLUE);
                g.setFont(new Font("Times New Roman", Font.BOLD, 20));
                g.drawString(ck[i],20,cury+10);
               // g.drawLine(0,cury,width,cury);
                g.setColor(Color.BLACK);
                for(int j = 1; j <=trace_len ; j ++) {
                    int st = j+inter_left;
                    if(trace[i].charAt(j-1) == '1')
                    {

                        g.drawLine(st*inter,cury-20,(st+1)*inter,cury-20);
                        if(state == 0 && j!=1)
                        {
                            g.drawLine(st*inter,cury-20,st*inter,cury+20);
                        }
                        state = 1;
                    }
                    else
                    {
                        g.drawLine(st*inter,cury+20,(st+1)*inter,cury+20);
                        if(state == 1&& j!=1)
                        {
                            g.drawLine(st*inter,cury-20,st*inter,cury+20);
                        }
                        state = 0;
                    }




                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        String ck[] ={"c1","c2","c3"};
        String traces[] = {"11010010100111101010","11010010100111101010","11010010100111101010"};
        draw d = new draw(null,traces);

    }
}
