package LeetCode.Top150.Stacks;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class LeetCode71 {

    public static String simplifyPath(String path) {
   Stack<String> stack=  new Stack<>();
   String[] components = path.split("/");

   for (String s : components){
       if(s.equals("..") &&  (stack.isEmpty() == false)){
           stack.pop();
       }
       else if(!s.equals(".") && !s.equals("..") && !s.equals("")){
           stack.push(s);
       }
   }
        ArrayList<String> arrayList = new ArrayList<>(stack);
        System.out.println(arrayList);

//        String ouputPath = "/";
//       if(arrayList.size()==1)
//           return ouputPath+arrayList.get(0);
//
//        for(int i = arrayList.size()-1; i>=0; i++)
//        {
//            if(i == 0){
//                ouputPath = ouputPath + arrayList.get(i);
//            }else{
//                ouputPath = ouputPath + arrayList.get(i)+"/";
//            }
//        }
        return "/"+String.join("/",stack);
    }






}
