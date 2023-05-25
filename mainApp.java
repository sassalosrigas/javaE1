/*
Team Number: 075
Team Members:
Rigas Sassalos (3220178)
Anais Farchat (3220280)
Agamemnonas Spyrou ()
 */
import java.util.Scanner;

 public class mainApp {
    public static void main(String[] args) {
        
        do{
            Scanner input = new Scanner(System.in);
            
            System.out.println("Choose action:");
            System.out.println("1. Add new advertisment carrier");
            System.out.println("2. Add new advertisment type");
            System.out.println("3. Add new advertisment");
            System.out.println("4. Show advertisments");
            System.out.println("5. Show specific carrier advertisments");
            System.out.println("6. Calculate specific carrier advertisment cost");
            System.out.println("7. Show number of advertisments per product");
            System.out.println("8. Calculate specific product advertisment cost");
            System.out.println("9. Show advertisment cost per product");
            System.out.println("10. End program");

            int res = input.nextInt();

            
            if(res==1){
                Scanner carrierinput = new Scanner(System.in);
                System.out.println("Carrier's name: ");
                String name = carrierinput.nextLine();
                System.out.println("Carrier's tax ID: ");
                String id = carrierinput.nextLine();
                Carrier carrier = new Carrier(id, name);


            }else if(res==2){
                Scanner adtypeinput = new Scanner(System.in);
                System.out.println("Advertisment's code: ");
                int adcode = adtypeinput.nextInt();
                System.out.println("Advertisment's description: ");
                String addesc = adtypeinput.nextLine();
                System.out.println("Carrier's tax ID: ");
                String id = adtypeinput.nextLine();
                AdType adtype = new AdType(adcode, addesc, id);

            }else if(res==3){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ad type: ");
                String type_code = scanner.nextLine();

                //to ad code tha mpainei aytomata gt #plhforikh
                int adcode=100;//placeholder that to fttiajoume meta
                System.out.println("Product description: ");
                String productdescription = scanner.nextLine();

                System.out.println("Supplier Tax ID: ");
                String supplierTaxID = scanner.nextLine();

                //xreiazetai h aitiologia alla den jeroye ti einai akoma
                System.out.println("Ad duration: ");
                int time = scanner.nextInt();

                if(type_code=="1"){

                    Scanner idinput = new Scanner(System.in);
                    System.out.println("Carrier's tax ID: ");
                    
                    String id = idinput.nextLine();;
                    AdType adtype = new AdType(adcode, "printed", id);





                }else if(type_code=="2"){

                }else if(type_code=="3"){

                }


            }








            
            
        
        }while(res!=10);
    }
 }
 