# -*- coding: utf-8 -*-
from z3 import *
trace = ""
x = Int('x')
m = Int('m')
b = Int('b')
v = Function("v",BoolSort(),IntSort())
HIC = Function("HIC",IntSort(),IntSort())
TIC = Function("TIC",IntSort(),BoolSort())
SIC = Function("SIC",IntSort(),IntSort())
r = Int('r')
TT2s = Function('TT2s',IntSort(),BoolSort())
TT1s = Function('TT1s',IntSort(),BoolSort())
TT1f = Function('TT1f',IntSort(),BoolSort())
TT2f = Function('TT2f',IntSort(),BoolSort())
Td2 = Function('Td2',IntSort(),BoolSort())
Tc1 = Function('Tc1',IntSort(),BoolSort())
ST2s = Function('ST2s',IntSort(),IntSort())
ST1s = Function('ST1s',IntSort(),IntSort())
ST1f = Function('ST1f',IntSort(),IntSort())
ST2f = Function('ST2f',IntSort(),IntSort())
Sd2 = Function('Sd2',IntSort(),IntSort())
Sc1 = Function('Sc1',IntSort(),IntSort())
HT2s = Function('HT2s',IntSort(),IntSort())
HT1s = Function('HT1s',IntSort(),IntSort())
HT1f = Function('HT1f',IntSort(),IntSort())
HT2f = Function('HT2f',IntSort(),IntSort())
Hd2 = Function('Hd2',IntSort(),IntSort())
Hc1 = Function('Hc1',IntSort(),IntSort())
t=Tactic("auflira")
s=t.solver()
s.add(b == 20)
s.add(v(False) == 0)
s.add(v(True) == 1)
s.add(ForAll(x,TIC(x) == True))
s.add(ForAll(x,SIC(x) == x ))
s.add(ForAll(x,HIC(x) == x-1 ))
s.add(HT2s(1) == 0)
s.add(HT2s(2) == HT2s(1) + v(TT2s(1)))
s.add(HT2s(3) == HT2s(2) + v(TT2s(2)))
s.add(HT2s(4) == HT2s(3) + v(TT2s(3)))
s.add(HT2s(5) == HT2s(4) + v(TT2s(4)))
s.add(HT2s(6) == HT2s(5) + v(TT2s(5)))
s.add(HT2s(7) == HT2s(6) + v(TT2s(6)))
s.add(HT2s(8) == HT2s(7) + v(TT2s(7)))
s.add(HT2s(9) == HT2s(8) + v(TT2s(8)))
s.add(HT2s(10) == HT2s(9) + v(TT2s(9)))
s.add(HT2s(11) == HT2s(10) + v(TT2s(10)))
s.add(HT2s(12) == HT2s(11) + v(TT2s(11)))
s.add(HT2s(13) == HT2s(12) + v(TT2s(12)))
s.add(HT2s(14) == HT2s(13) + v(TT2s(13)))
s.add(HT2s(15) == HT2s(14) + v(TT2s(14)))
s.add(HT2s(16) == HT2s(15) + v(TT2s(15)))
s.add(HT2s(17) == HT2s(16) + v(TT2s(16)))
s.add(HT2s(18) == HT2s(17) + v(TT2s(17)))
s.add(HT2s(19) == HT2s(18) + v(TT2s(18)))
s.add(HT2s(20) == HT2s(19) + v(TT2s(19)))
s.add(HT2s(21) == HT2s(20) + v(TT2s(20)))
s.add(ForAll(x,Implies(And(x>=1,x<=b),Implies(TT2s(x),ST2s(HT2s(x)+1) == x))))
s.add(ForAll(x,Implies(x>HT2s(b+1),ST2s(x) == b+2)))
s.add(HT1s(1) == 0)
s.add(HT1s(2) == HT1s(1) + v(TT1s(1)))
s.add(HT1s(3) == HT1s(2) + v(TT1s(2)))
s.add(HT1s(4) == HT1s(3) + v(TT1s(3)))
s.add(HT1s(5) == HT1s(4) + v(TT1s(4)))
s.add(HT1s(6) == HT1s(5) + v(TT1s(5)))
s.add(HT1s(7) == HT1s(6) + v(TT1s(6)))
s.add(HT1s(8) == HT1s(7) + v(TT1s(7)))
s.add(HT1s(9) == HT1s(8) + v(TT1s(8)))
s.add(HT1s(10) == HT1s(9) + v(TT1s(9)))
s.add(HT1s(11) == HT1s(10) + v(TT1s(10)))
s.add(HT1s(12) == HT1s(11) + v(TT1s(11)))
s.add(HT1s(13) == HT1s(12) + v(TT1s(12)))
s.add(HT1s(14) == HT1s(13) + v(TT1s(13)))
s.add(HT1s(15) == HT1s(14) + v(TT1s(14)))
s.add(HT1s(16) == HT1s(15) + v(TT1s(15)))
s.add(HT1s(17) == HT1s(16) + v(TT1s(16)))
s.add(HT1s(18) == HT1s(17) + v(TT1s(17)))
s.add(HT1s(19) == HT1s(18) + v(TT1s(18)))
s.add(HT1s(20) == HT1s(19) + v(TT1s(19)))
s.add(HT1s(21) == HT1s(20) + v(TT1s(20)))
s.add(ForAll(x,Implies(And(x>=1,x<=b),Implies(TT1s(x),ST1s(HT1s(x)+1) == x))))
s.add(ForAll(x,Implies(x>HT1s(b+1),ST1s(x) == b+2)))
s.add(HT1f(1) == 0)
s.add(HT1f(2) == HT1f(1) + v(TT1f(1)))
s.add(HT1f(3) == HT1f(2) + v(TT1f(2)))
s.add(HT1f(4) == HT1f(3) + v(TT1f(3)))
s.add(HT1f(5) == HT1f(4) + v(TT1f(4)))
s.add(HT1f(6) == HT1f(5) + v(TT1f(5)))
s.add(HT1f(7) == HT1f(6) + v(TT1f(6)))
s.add(HT1f(8) == HT1f(7) + v(TT1f(7)))
s.add(HT1f(9) == HT1f(8) + v(TT1f(8)))
s.add(HT1f(10) == HT1f(9) + v(TT1f(9)))
s.add(HT1f(11) == HT1f(10) + v(TT1f(10)))
s.add(HT1f(12) == HT1f(11) + v(TT1f(11)))
s.add(HT1f(13) == HT1f(12) + v(TT1f(12)))
s.add(HT1f(14) == HT1f(13) + v(TT1f(13)))
s.add(HT1f(15) == HT1f(14) + v(TT1f(14)))
s.add(HT1f(16) == HT1f(15) + v(TT1f(15)))
s.add(HT1f(17) == HT1f(16) + v(TT1f(16)))
s.add(HT1f(18) == HT1f(17) + v(TT1f(17)))
s.add(HT1f(19) == HT1f(18) + v(TT1f(18)))
s.add(HT1f(20) == HT1f(19) + v(TT1f(19)))
s.add(HT1f(21) == HT1f(20) + v(TT1f(20)))
s.add(ForAll(x,Implies(And(x>=1,x<=b),Implies(TT1f(x),ST1f(HT1f(x)+1) == x))))
s.add(ForAll(x,Implies(x>HT1f(b+1),ST1f(x) == b+2)))
s.add(HT2f(1) == 0)
s.add(HT2f(2) == HT2f(1) + v(TT2f(1)))
s.add(HT2f(3) == HT2f(2) + v(TT2f(2)))
s.add(HT2f(4) == HT2f(3) + v(TT2f(3)))
s.add(HT2f(5) == HT2f(4) + v(TT2f(4)))
s.add(HT2f(6) == HT2f(5) + v(TT2f(5)))
s.add(HT2f(7) == HT2f(6) + v(TT2f(6)))
s.add(HT2f(8) == HT2f(7) + v(TT2f(7)))
s.add(HT2f(9) == HT2f(8) + v(TT2f(8)))
s.add(HT2f(10) == HT2f(9) + v(TT2f(9)))
s.add(HT2f(11) == HT2f(10) + v(TT2f(10)))
s.add(HT2f(12) == HT2f(11) + v(TT2f(11)))
s.add(HT2f(13) == HT2f(12) + v(TT2f(12)))
s.add(HT2f(14) == HT2f(13) + v(TT2f(13)))
s.add(HT2f(15) == HT2f(14) + v(TT2f(14)))
s.add(HT2f(16) == HT2f(15) + v(TT2f(15)))
s.add(HT2f(17) == HT2f(16) + v(TT2f(16)))
s.add(HT2f(18) == HT2f(17) + v(TT2f(17)))
s.add(HT2f(19) == HT2f(18) + v(TT2f(18)))
s.add(HT2f(20) == HT2f(19) + v(TT2f(19)))
s.add(HT2f(21) == HT2f(20) + v(TT2f(20)))
s.add(ForAll(x,Implies(And(x>=1,x<=b),Implies(TT2f(x),ST2f(HT2f(x)+1) == x))))
s.add(ForAll(x,Implies(x>HT2f(b+1),ST2f(x) == b+2)))
s.add(Hd2(1) == 0)
s.add(Hd2(2) == Hd2(1) + v(Td2(1)))
s.add(Hd2(3) == Hd2(2) + v(Td2(2)))
s.add(Hd2(4) == Hd2(3) + v(Td2(3)))
s.add(Hd2(5) == Hd2(4) + v(Td2(4)))
s.add(Hd2(6) == Hd2(5) + v(Td2(5)))
s.add(Hd2(7) == Hd2(6) + v(Td2(6)))
s.add(Hd2(8) == Hd2(7) + v(Td2(7)))
s.add(Hd2(9) == Hd2(8) + v(Td2(8)))
s.add(Hd2(10) == Hd2(9) + v(Td2(9)))
s.add(Hd2(11) == Hd2(10) + v(Td2(10)))
s.add(Hd2(12) == Hd2(11) + v(Td2(11)))
s.add(Hd2(13) == Hd2(12) + v(Td2(12)))
s.add(Hd2(14) == Hd2(13) + v(Td2(13)))
s.add(Hd2(15) == Hd2(14) + v(Td2(14)))
s.add(Hd2(16) == Hd2(15) + v(Td2(15)))
s.add(Hd2(17) == Hd2(16) + v(Td2(16)))
s.add(Hd2(18) == Hd2(17) + v(Td2(17)))
s.add(Hd2(19) == Hd2(18) + v(Td2(18)))
s.add(Hd2(20) == Hd2(19) + v(Td2(19)))
s.add(Hd2(21) == Hd2(20) + v(Td2(20)))
s.add(ForAll(x,Implies(And(x>=1,x<=b),Implies(Td2(x),Sd2(Hd2(x)+1) == x))))
s.add(ForAll(x,Implies(x>Hd2(b+1),Sd2(x) == b+2)))
s.add(Hc1(1) == 0)
s.add(Hc1(2) == Hc1(1) + v(Tc1(1)))
s.add(Hc1(3) == Hc1(2) + v(Tc1(2)))
s.add(Hc1(4) == Hc1(3) + v(Tc1(3)))
s.add(Hc1(5) == Hc1(4) + v(Tc1(4)))
s.add(Hc1(6) == Hc1(5) + v(Tc1(5)))
s.add(Hc1(7) == Hc1(6) + v(Tc1(6)))
s.add(Hc1(8) == Hc1(7) + v(Tc1(7)))
s.add(Hc1(9) == Hc1(8) + v(Tc1(8)))
s.add(Hc1(10) == Hc1(9) + v(Tc1(9)))
s.add(Hc1(11) == Hc1(10) + v(Tc1(10)))
s.add(Hc1(12) == Hc1(11) + v(Tc1(11)))
s.add(Hc1(13) == Hc1(12) + v(Tc1(12)))
s.add(Hc1(14) == Hc1(13) + v(Tc1(13)))
s.add(Hc1(15) == Hc1(14) + v(Tc1(14)))
s.add(Hc1(16) == Hc1(15) + v(Tc1(15)))
s.add(Hc1(17) == Hc1(16) + v(Tc1(16)))
s.add(Hc1(18) == Hc1(17) + v(Tc1(17)))
s.add(Hc1(19) == Hc1(18) + v(Tc1(18)))
s.add(Hc1(20) == Hc1(19) + v(Tc1(19)))
s.add(Hc1(21) == Hc1(20) + v(Tc1(20)))
s.add(ForAll(x,Implies(And(x>=1,x<=b),Implies(Tc1(x),Sc1(Hc1(x)+1) == x))))
s.add(ForAll(x,Implies(x>Hc1(b+1),Sc1(x) == b+2)))
s.add(ForAll([x],Implies(And(x>=1,x<=b+1),HT1f(x) >= HT2s(x))))
s.add(ForAll([x],Implies(And(x>=1,x<=b),Implies(HT1s(x)-HT2f(x) == 4 ,Not(TT1s(x)) ) )  ))
s.add(ForAll([x],Implies(And(x>=1,x<=b),Implies( And((HIC(x)) % 5  == 0,TIC(x)),TT1s(x) )  )))
s.add(ForAll([x],Implies(And(x>=1,x<=b),Implies( Not(And((HIC(x)) % 5  == 0,TIC(x))),Not(TT1s(x) ))  )))
s.add(And(r<=10,r>=0))
s.add(ForAll([x],Implies(And(x>=1,x<=b+1),Implies(HIC(x)-r>0,Hd2(x)==HIC(x) - r))))
s.add(ForAll([x],Implies(And(x>=1,x<=b+1),Implies(HIC(x)-r<=0,Hd2(x)== 0 ))))
s.add(ForAll([x],Implies(And(x>=1,x<=b),Implies( And((Hd2(x)) % 8  == 0,Td2(x)),TT2s(x) )  )))
s.add(ForAll([x],Implies(And(x>=1,x<=b),Implies( Not(And((Hd2(x)) % 8  == 0,Td2(x))),Not(TT2s(x) ))  )))
s.add(ForAll([x],Implies(And(x>=1,x<=b),(TT1f(x) == And(TIC(x),Exists(m,And(m>=1,m<=x,TT1s(m),HIC(x)-HIC(m) == 2)))))))
s.add(ForAll([x],Implies(And(x>=1,x<=b),(TT2f(x) == And(TIC(x),Exists(m,And(m>=1,m<=x,TT2s(m),HIC(x)-HIC(m) == 6)))))))
s.add(ForAll([x],Implies(And(x>=1,x<=b+1),Hc1(x) >= HIC(x))))
s.add(ForAll([x],Implies(And(x >= 1, x<=b),(Or(TT2s(x) , TT1s(x) , TT1f(x) , TT2f(x) , Td2(x) , Tc1(x) )))))
print(s.check())
if (str(s.check())=='unsat'):
	with open(r'traces.txt', 'w', encoding='utf-8') as f:
		f.write("unsat")
	quit()
m = s.model()
print("T2s: ")
trace += "T2s: "
for i in range(1,21):
	temp=str(m.eval(v(TT2s(i))))
	print(temp,end=' '),
	trace += temp
print("\n")
trace += "\n"
print("T1s: ")
trace += "T1s: "
for i in range(1,21):
	temp=str(m.eval(v(TT1s(i))))
	print(temp,end=' '),
	trace += temp
print("\n")
trace += "\n"
print("T1f: ")
trace += "T1f: "
for i in range(1,21):
	temp=str(m.eval(v(TT1f(i))))
	print(temp,end=' '),
	trace += temp
print("\n")
trace += "\n"
print("T2f: ")
trace += "T2f: "
for i in range(1,21):
	temp=str(m.eval(v(TT2f(i))))
	print(temp,end=' '),
	trace += temp
print("\n")
trace += "\n"
print("d2: ")
trace += "d2: "
for i in range(1,21):
	temp=str(m.eval(v(Td2(i))))
	print(temp,end=' '),
	trace += temp
print("\n")
trace += "\n"
print("c1: ")
trace += "c1: "
for i in range(1,21):
	temp=str(m.eval(v(Tc1(i))))
	print(temp,end=' '),
	trace += temp
print("\n")
trace += "\n"
print(trace)
with open(r'traces.txt', 'w', encoding='utf-8') as f:
	f.write(trace[:-1])