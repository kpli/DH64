
public class DH64
{
	private static long p = 17;
	private static long g = 3;

	private long powmodp(long x , long n) {
		if (n == 0) return 1;
		if (n == 1) return x % p;
		long res = powmodp(x * x % p, n / 2);
		if ((n & 1 ) != 0)
			res = res * x % p;
		return res;
	}

	public long PublicKey(long privateKey)
	{
		return powmodp(g, privateKey);
	}

	public long Secret(long privateKey, long anotherPublicKey)
	{
		return powmodp(anotherPublicKey, privateKey);
	}
}