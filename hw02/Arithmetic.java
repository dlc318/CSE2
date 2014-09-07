///////////////
//Dana Cunningham
//September 9, 2014
//[CSE2]
//Arithmetic
//
//Computes total cost with sales tax of 6%

//  define a class
public class Arithmetic{

    //main method required for every Java program
    public static void main(String[] args) {

        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //('$' is park of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        //Sales Tax Percentage
        double taxPercent=0.06;
        
        //Total cost of socks and with sales tax
        double totalSockCost$=(nSocks*sockCost$),
               salesTaxSockCost$=(totalSockCost$*taxPercent*100);
        
        //Total cost of Glass and with sales tax
        double totalGlassCost$=(nGlasses*glassCost$), 
               salesTaxGlassCost$=(totalGlassCost$*taxPercent*100);
        
        //Total cost of Envelopes and with sales tax
        double totalEnvelopeCost$=(nEnvelopes*envelopeCost$),
               salesTaxEnvelopeCost$=(totalEnvelopeCost$*taxPercent*100);
        
        //Total cost and cost with sales tax
        double totalCost$=(nSocks*sockCost$)+(nGlasses*glassCost$)+(nEnvelopes*envelopeCost$),
               totalCostSalesTax$=(totalCost$*taxPercent*100);
        
        System.out.println("The items being bought are socks, glasses, and envelopes");
        System.out.println(nSocks +" pairs of socks, "+ nGlasses +" glasses, and "+ nEnvelopes + " envelope are being bought");
        System.out.println("One pair of socks costs "+ sockCost$+ ", one glass costs " +glassCost$+ ", and one envelope costs "+ envelopeCost$);
        System.out.println("The cost of all the socks purchased is " +totalSockCost$+ ", and the sales tax on that cost is "+ (int)salesTaxSockCost$/100.0);
        System.out.println("The cost of all the glasses purchased is " +totalGlassCost$+ ", and the sales tax on that cost is "+ (int)salesTaxGlassCost$/100.0);
        System.out.println("The cost of all the envelopes purchased is " +totalEnvelopeCost$+ ", and the sales tax on that cost is "+ (int)salesTaxEnvelopeCost$/100.0);
        System.out.println("The total cost of the entire purchase without sales tax is " +totalCost$);
        System.out.println("The total sales tax is "+(int)totalCostSalesTax$/100.0);
        System.out.println("The total cost of the entire purchase including sales tax is "+(totalCost$+((int)totalCostSalesTax$/100.0)));
    
    }
}