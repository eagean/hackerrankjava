

    static int B,H;
    static boolean flag = true;
    static {
        Scanner scnr = new Scanner(System.in);
        B = scnr.nextInt();
        H = scnr.nextInt();
        if(B<=0 || H<=0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            
        }
    
}

