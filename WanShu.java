package test50;

/**
 * @author Martin
 *������9�� WanShu.java 
 *��Ŀ��һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"������6=1��2��3.��� �ҳ�1000���ڵ�����������
 */
public class WanShu {

    public static boolean isWanShu(int a){
        int cup = 0;
        for(int i=1; i<a; i++){
            if(a%i == 0)
                cup = cup + i;
        }
        return (cup == a);
    }
    
    public static void main(String[] args) {
        for(int i=1; i<1000; i++){
            if(isWanShu(i)){
                System.out.print(i + ",");
            }
        }
    }
}
/* 
6,28,496,
 */