public class Stock {

   private final int NUMBER_OF_DATASETS = 5; //should be static?
/**
 * Create array of size NUMBER_OF_DATASETS
 */
   private DataSet[] stock = new DataSet[NUMBER_OF_DATASETS];
   
   private String name;
   
/**
 * Constructs a Stock
 */
public Stock() {

   name = "???";
   
   stock[0] = GraphData columnOneTwo = new GraphData;
   stock[1] = PeakFinder columnThree = new PeakFinder;
   stock[2] = ValleyFinder columnFour = new ValleyFinder;
}
