
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VA {

    public static void main(String[] args) throws IOException {
        try {
            //  File f = new File("C:\\Users\\Pinki\\Desktop\\NBAD\\VA\\src\\10_17_2016_.txt");

            List<Detail> detail = new ArrayList<Detail>();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pinki\\Desktop\\NBAD\\VA\\src\\10_17_2016_.csv"));
            String line = null;
            int count = 0;
            while ((line = br.readLine()) != null) {
                count++;
                Scanner sc = new Scanner(line);
                line = sc.nextLine();

                String[] values = new String[13];
                values = line.split(",", -1);

                String id = values[0];
                String loc_code = values[1];
                String emp_dept = values[2];
                String emp_team = values[3];
                String emp_shift = values[4];
                String emp_id = values[5];
                String emp_name = values[6];
                String clock_in = values[7];
                String clock_out = values[8];

                String emp_call_cd = values[9];
                String emp_sch_cd = values[10];

                Detail d = new Detail(id, loc_code, emp_dept, emp_team, emp_shift, emp_id, emp_name, clock_in, clock_out, emp_call_cd, emp_sch_cd);
                detail.add(d);
            }
            
            int min = count;
            System.out.println("{");
            System.out.println("\"" + detail.get(1).getloc_code() + "\":");
            System.out.println("{");
            System.out.println("\"" + detail.get(1).getemp_dept() + "\":");
            System.out.println("{");
            System.out.println("\"" + detail.get(1).getemp_team() + "\":");
            System.out.println("{");
            System.out.println("\"" + detail.get(1).getemp_id() + "\":");
            System.out.println("{");
            System.out.println("\"" + detail.get(0).getemp_name() + "\":" + "\"" + detail.get(1).getemp_name() + "\",");
            System.out.println("\"" + detail.get(0).getemp_sch_cd() + "\":" + "\"" + detail.get(1).getemp_sch_cd() + "\",");
            System.out.println("\"" + detail.get(0).getemp_call_cd() + "\":" + "\"" + detail.get(1).getemp_call_cd() + "\"");
            System.out.println("}");

            for (int i = 2; i < min; i++) {

                if (detail.get(i).getloc_code().equals(detail.get(i - 1).getloc_code())) {
                    // System.out.println("{");   // starting for emp dept if equal
                    if (detail.get(i).getemp_dept().equals(detail.get(i - 1).getemp_dept())) //for emp dept same
                    {
                        // System.out.println("{"); // opening for emp team
                        if (detail.get(i).getemp_team().equals(detail.get(i - 1).getemp_team())) {
                            // System.out.println("{");
                            if (!detail.get(i).getemp_id().equals(detail.get(i - 1).getemp_id())) {
                                if (i == (min )) {
                                } else {
                                    System.out.print(",");
                                }
                                System.out.println("\"" + detail.get(i).getemp_id() + "\":");
                                System.out.println("{");
                                System.out.println("\"" + detail.get(0).getemp_name() + "\":" + "\"" + detail.get(i).getemp_name() + "\",");
                                System.out.println("\"" + detail.get(0).getemp_sch_cd() + "\":" + "\"" + detail.get(i).getemp_sch_cd() + "\",");
                                System.out.println("\"" + detail.get(0).getemp_call_cd() + "\":" + "\"" + detail.get(i).getemp_call_cd() + "\"");
                                System.out.println("}");
                            }
                            else{
                            }
                             }
                        else  // dept same but team changing
                        {
                            System.out.println("}");
                            if (i == (min)) {
                            } else {
                                System.out.print(",");
                            }
                            System.out.println("\"" + detail.get(i).getemp_team() + "\":");
                            System.out.println("{");
                            if (!detail.get(i).getemp_id().equals(detail.get(i - 1).getemp_id())) {

                                System.out.println("\"" + detail.get(i).getemp_id() + "\":");
                                System.out.println("{");
                                System.out.println("\"" + detail.get(0).getemp_name() + "\":" + "\"" + detail.get(i).getemp_name() + "\",");
                                System.out.println("\"" + detail.get(0).getemp_sch_cd() + "\":" + "\"" + detail.get(i).getemp_sch_cd() + "\",");
                                System.out.println("\"" + detail.get(0).getemp_call_cd() + "\":" + "\"" + detail.get(i).getemp_call_cd() + "\"");
                                System.out.println("}");
                            }
                        } //
                    }
                    else{ 
                        // department changing
                        System.out.println("}");  // team close
                        System.out.println("}");  // dept close
                    if (i == (min)) {
                        } else {
                            System.out.print(",");}
                             System.out.println("\"" + detail.get(i).getemp_dept() + "\":");
                             System.out.println("{");
                              if (!detail.get(i).getemp_team().equals(detail.get(i - 1).getemp_team()))
                             {
                                 System.out.println("\"" + detail.get(i).getemp_team() + "\":");
                                  System.out.println("{");
                            // System.out.println("{");
                            if (!detail.get(i).getemp_id().equals(detail.get(i - 1).getemp_id())) {
                                
                                System.out.println("\"" + detail.get(i).getemp_id() + "\":");
                                System.out.println("{");
                                System.out.println("\"" + detail.get(0).getemp_name() + "\":" + "\"" + detail.get(i).getemp_name() + "\",");
                                System.out.println("\"" + detail.get(0).getemp_sch_cd() + "\":" + "\"" + detail.get(i).getemp_sch_cd() + "\",");
                                System.out.println("\"" + detail.get(0).getemp_call_cd() + "\":" + "\"" + detail.get(i).getemp_call_cd() + "\"");
                                System.out.println("}");
                            }
                             }
                        else
                        {
                        }
                       }
                    
                    }
                    // location changing
                else
                {
                System.out.println("}");  // team closing
                System.out.println("}");  //dept closimg
                System.out.println("}");  // loc closing
                    if (i == (min)) {
                    } else {
                        System.out.print(",");
                    }
                     System.out.println("\"" + detail.get(i).getloc_code() + "\":");
                     System.out.println("{");
                     if(!detail.get(i).getemp_dept().equals(detail.get(i - 1).getemp_dept()))
                     {
                           System.out.println("\"" + detail.get(i).getemp_dept() + "\":");
                            System.out.println("{");
                            if(!detail.get(i).getemp_id().equals(detail.get(i - 1).getemp_id()))
                                    {
                                         System.out.println("\"" + detail.get(i).getemp_team() + "\":");
                                        System.out.println("{");
                                        if (!detail.get(i).getemp_id().equals(detail.get(i - 1).getemp_id())) {

                                            System.out.println("\"" + detail.get(i).getemp_id() + "\":");
                                            System.out.println("{");
                                            System.out.println("\"" + detail.get(0).getemp_name() + "\":" + "\"" + detail.get(i).getemp_name() + "\",");
                                            System.out.println("\"" + detail.get(0).getemp_sch_cd() + "\":" + "\"" + detail.get(i).getemp_sch_cd() + "\",");
                                            System.out.println("\"" + detail.get(0).getemp_call_cd() + "\":" + "\"" + detail.get(i).getemp_call_cd() + "\"");
                                            System.out.println("}");
                            }
                                         
                                    }
                            else{}
                     }
                     else{}
                    
                }
                }
            System.out.println("}");
            System.out.println("}");
            System.out.println("}");
            System.out.println("}");
            PrintStream out = new PrintStream(new FileOutputStream("C:\\Users\\Pinki\\Desktop\\VA\\output.json"));
         System.setOut(out);

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    
}
}
