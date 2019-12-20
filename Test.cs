using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Test
{
	static void Main(string[] args)
	{
		DH64 dh64 = new DH64();

		for( int i = -5; i < 5; i++)
		{
			long privateKey = i;
			long publicKey = dh64.PublicKey(privateKey);
			Console.WriteLine("privateKey:" + privateKey);
			Console.WriteLine("publicKey:" + publicKey);
		}

	}
}


/*nds 
https://github.com/devkitPro/ndstool
https://github.com/pleonex/tinke
/*