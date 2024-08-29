public  class fact
{
    public static void main(String[] args) 
    {
        int i,fact=1;
        int num=5;
        for (i = 1; i <=5;i++) 
        {
            fact=fact*i;
        }
        System.out.println("factorial "+num+ "i s "+fact);
    }
}