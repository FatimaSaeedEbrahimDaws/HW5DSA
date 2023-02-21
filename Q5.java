import java.util.Scanner;
public class Q5 {

  //  public class RoundRobinExample {
        public static void main(String args[]) {
            int n,x,q_t,count=0,temp,sq=0,b_t[],w_t[],ta_t[],rem_bt[];
            float aw_t=0,ata_t=0;
            b_t = new int[10];
            w_t = new int[10];
            ta_t = new int[10];
            rem_bt = new int[10];
            Scanner sc=new Scanner(System.in);
            System.out.print("Number of processes(maximum 10) = ");
            n = sc.nextInt();
            System.out.print("Enter process burst time\n");
            for (x=0; x<n; x++) {
                System.out.print("P"+x+" = ");
                b_t[x] = sc.nextInt();
                rem_bt[x] = b_t[x];
            }
            System.out.print("Enter the quantum time: ");
            q_t = sc.nextInt();
            while(true) {
                for (x=0,count=0; x<n; x++) {
                    temp = q_t;
                    if(rem_bt[x] == 0) {
                        count++;
                        continue;
                    }
                    if(rem_bt[x]>q_t)
                        rem_bt[x]= rem_bt[x] - q_t;
                    else if(rem_bt[x]>=0) {
                        temp = rem_bt[x];
                        rem_bt[x] = 0;
                    }
                    sq = sq + temp;
                    ta_t[x] = sq;
                }
                if(n == count)
                    break;
            }
            System.out.print("*********************************************************************************");
            System.out.print("\nProcess\t  Burst Time\t  Turnaround Time\t  Waiting Time\n");
            System.out.print("*********************************************************************************");
            for(x=0; x<n; x++) {
                w_t[x]=ta_t[x]-b_t[x];
                aw_t=aw_t+w_t[x];
                ata_t=ata_t+ta_t[x];
                System.out.print("\n "+(x+1)+"\t\t\t "+b_t[x]+"\t\t\t\t "+ta_t[x]+"\t\t\t\t\t "+w_t[x]+"\n");
            }
            aw_t=aw_t/n;
            ata_t=ata_t/n;
            System.out.println("\nThe Average waiting Time = "+aw_t+"\n");
            System.out.println("The Average turnaround time = "+ata_t);
        }
    }


