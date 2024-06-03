public class LargestDifference {
    public static void main(String[] args) {
        int[] myList = {-2,3,45,55,67,87,89};
        largediff = myList[2]-myList[1];
        for(int i= 2: i < (myList.length)-1){
            if(myList[i]-myList[i+1] > largediff){
                largediff = myList[i]-myList[i+1];
            }
        }
        System.out.println(largediff);
    
}
