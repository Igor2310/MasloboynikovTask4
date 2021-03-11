class Task4 {
    private String line1;
    private String line2;
    public Task4(String s1, String s2){
        line1=s1;
        line2=s2;
    }
    public void getline(){
        boolean flag = false;
        int j;
        String value = "";
        for(j=0; j<line1.length() ; j++) {// Поиск заданного значения
            if (j>=line1.length()/2 && flag ==false ){
                value+=line2;
                flag = true;
            }
            value+=line1.toCharArray()[j];

        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        String s1 = "abceee";
        String s2 = "vvvbbb";
        Task4 s3 = new Task4(s1,s2);
        s3.getline();
    }
}