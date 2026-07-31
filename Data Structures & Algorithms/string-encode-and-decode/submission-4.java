class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();

        for(String s : strs){
            sizes.add(s.length());
        }
        for(int size : sizes){
            sb.append(size).append(',');
        }
        sb.append('#');
        for(String s:strs){
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0){
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        List<Integer> size = new ArrayList<>();
        int i = 0;
        while(str.charAt(i) != '#'){
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i) != ','){
                sb.append(str.charAt(i));
                i++;
            }
            size.add(Integer.parseInt(sb.toString()));
            i++;
        } 
        i++;
        for(int s : size){
            result.add(str.substring(i, i + s));
            i += s;
        }
        
        return result;
        

    }
}
