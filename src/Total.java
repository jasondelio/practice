public class Total {
    public int sum(int x, int y){
        if(x > 100){
            throw new TooBigException("TOO BIG");
        }
        return x + y;
    }
}
