public class Test {
    public static void main(String[] args) {
        DH64 dh64 = new DH64();
        for( int i = -5; i <5; i++)
        {
            long privateKey = i;
            long publicKey = dh64.PublicKey(privateKey);
            System.out.println("privateKey:" + privateKey);
            System.out.println("publicKey:" + publicKey);
        }
    }
}