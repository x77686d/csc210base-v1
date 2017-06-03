#
# Has mods from jhh and whm
if [ $# -eq 1 ]
then
    expr=$1
else
    expr=i+i+i+i+i+i+i+i+i+i+10
    expr=i*i*i*i*i
    expr=i
fi

cat >count.py <<X
for i in range(1,1000001):
    print($expr)
X

cat >count.java <<X
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
public class count {
    // uses more system time than user
    public static void main(String args[]) throws Exception {
        BufferedWriter out = new BufferedWriter(
                new FileWriter(java.io.FileDescriptor.out),
                4096);

        for (int i = 1; i <= 1000000; i++) {
            out.write(String.valueOf($expr));
            out.newLine();
            }
        out.flush();
        }
    }
X

cat >count.c <<X
#include <stdio.h>

int main()
{
    for (int i = 1; i <= 1000000; i++)
        printf("%d\n", $expr);
}
X

echo Java version:
java -version

echo Compiling Java
javac count.java

echo Running Java...
time java count > java.out

echo Running Python 2...
time python2 count.py > py2.out

echo Running Python 3...
time python3 count.py > py3.out

echo Compiling C...
gcc -O3 count.c
echo Running C
time ./a.out > c.out

sha1sum {java,py2,py3,c}.out
