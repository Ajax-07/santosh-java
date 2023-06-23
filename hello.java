class hello{
    public static void main(String args[]){
        for(int i=0; i<=5; i++){
            char X = 'A';
            for(int j=1; j<=2*i+1; j++){
                if(j==1 || j==2*i+1)
                  System.out.print("1");
                else
                  System.out.print(X++);
            }
            System.out.println();
        }

    }
}


