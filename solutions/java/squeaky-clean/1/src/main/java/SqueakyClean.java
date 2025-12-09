class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean enconteredDash = false;
        java.util.Map<Character, Character> utilMap = java.util.Map
            .of('4', 'a', '3', 'e', '0', 'o', '1', 'l', '7', 't');

        for(char c : identifier.toCharArray()){
            if(Character.isWhitespace(c)){
                sb.append('_');
                continue;
            }
            
            if(c == '-'){
                enconteredDash = true;
                continue;
            }
            
            if(enconteredDash){
                sb.append(Character.toUpperCase(c));
                enconteredDash = false;
                continue;
            }

            if(Character.isDigit(c)){
                sb.append(utilMap.get(c));
                continue;
            }

            if(!Character.isLetter(c)){
                continue;
            }
            
            sb.append(c);
        }

        return sb.toString();
    }
}
