import java.util.*;
import java.util.stream.Collectors;
//CodeForce1520A

public class doNotBeDistracted {
    public static void main(String[] args) {
        int numOfCases, numOfTasks = 0;
        String ans = "";
        Stack<String> removeRepeat = new Stack();
        Stack<String> compare = new Stack();
        List<String> finalOrder = new ArrayList<>();
        ArrayList<String> tasks = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        numOfCases = Integer.valueOf(scan.next());
        for (int i = 0; i < numOfCases; i++){
            numOfTasks = Integer.valueOf(scan.next());
            String temp = "";
            temp = scan.next();
            char[] list = temp.toCharArray();

            tasks.clear();
            for (int n = 0; n < list.length; n++){
                tasks.add(String.valueOf(list[n]));
            }

            removeRepeat.clear();
            for (int j = 0; j< tasks.size();j++){
                if(removeRepeat.isEmpty()){
                    removeRepeat.push(tasks.get(j));
                } else if (!removeRepeat.peek().equals(tasks.get(j))){
                    removeRepeat.push(tasks.get(j));
                }
            }

            compare.clear();
            finalOrder.clear();
           finalOrder = removeRepeat.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
            for (int m = 0; m < finalOrder.size(); m++){
                if (compare.isEmpty()){
                    if (m==finalOrder.size()-1) {
                        compare.push(String.valueOf(finalOrder.get(m)));
                        ans += "\n"+ "Yes";
                    }else{
                        compare.push(String.valueOf(finalOrder.get(m)));
                    }
                }else if (!compare.peek().equals(finalOrder.get(m))){
                    if (m==finalOrder.size()-1) {
                        compare.push(String.valueOf(finalOrder.get(m)));
                        ans += "\n"+ "Yes";
                    }else{
                        compare.push(String.valueOf(finalOrder.get(m)));
                    }
                } else {
                    ans += "\n"+ "No";
                    break;
                }
            }
        }
        System.out.println(ans.substring(1));
    }
}




