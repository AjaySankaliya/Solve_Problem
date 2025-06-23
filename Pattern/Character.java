public class Character {
    public static void main(String[] args) {
        char ch = 'A';

        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for(int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(i%2!=0)
                {
                    System.out.print(count+" ");
                    count++;
                }
                else
                {
                    System.out.print(ch+" ");
                    ch++;
                }
            }
            System.out.println();
        }

    }
}
