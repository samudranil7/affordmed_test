import java.util.*;
public class HelloWorld
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        char arr[][] = new char[n][m];
        String word = scan.next();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = scan.next().charAt(0);
            }
        }
        int check[][] = new int[n][m];
        int bcheck = 0;
        int wg = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                bcheck = 0;
                if(arr[i][j]==word.charAt(0))
                {
                    check[i][j] = 1;
                    int k = 1;
                    for(k=1;k<word.length();k++)
                    {
                        char temp = word.charAt(k);
                        if(j+1<m && arr[i][j+1]==temp && check[i][j+1]==0)
                        {
                            check[i][j+1] = 1;
                            j++;
                        }
                        else if(j-1>0 && arr[i][j-1]==temp && check[i][j-1]==0)
                        {
                            check[i][j-1] = 1;
                            j--;
                        }
                        else if(i+1<n && arr[i+1][j]==temp && check[i+1][j]==0)
                        {
                            check[i+1][j] = 1;
                            i++;
                        }
                        else if(i-1>0 && arr[i-1][j]==temp && check[i-1][j]==0)
                        {
                            check[i-1][j] = 1;
                            i--;
                        }
                        else
                        {
                            check = new int[n][m];
                            bcheck = 1;
                            break;
                        }
                    }
                    if(k==word.length() && bcheck==0)
                    {
                        wg = 1;
                        break;
                    }
                }
            }
            if(bcheck==0 && wg==1)
            {
                break;
            }
        }
        if(wg==1)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}
