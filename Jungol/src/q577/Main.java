package q577;

import java.util.Scanner;

class Ret {
	private int v1;
	private int v2;
	
	public int getV1() {
		return v1;
	}
	public void setV1(int v1) {
		this.v1 = v1;
	}
	public int getV2() {
		return v2;
	}
	public void setV2(int v2) {
		this.v2 = v2;
	}
}

public class Main {
	public static Ret calc(Ret p) {
		if(p.getV1() > p.getV2()) {
			int max = p.getV1() / 2;
			int min = p.getV2() * 2;
			p.setV1(max);
			p.setV2(min);
		}else {
			int max = p.getV2() / 2;
			int min = p.getV1() * 2;
			p.setV1(min);
			p.setV2(max);
		}
		
		return p;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();

		System.out.println(inp1 + " " + inp2);
		Ret r = new Ret();
		r.setV1(inp1);
		r.setV2(inp2);
		
		Ret res = calc(r);
		System.out.print(res.getV1() + " ");
		System.out.print(res.getV2());
	}
}
