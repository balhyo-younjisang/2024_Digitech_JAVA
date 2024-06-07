package Generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 재료 준비
		Filament f = new Filament();
		Rasin r = new Rasin();
		// 재료를 사용하는 3D 프린터를 준비
		ThreeDPrinter tdp = new ThreeDPrinter();
		Generic3DPrinter<Filament> tdpf = new Generic3DPrinter<Filament>();
		Generic3DPrinter<Rasin> tdpr = new Generic3DPrinter<Rasin>();
		// 3D 프린터에 재료를 넣기
		tdp.setMaterial(f);
		tdpf.setMaterial(f);
		tdpr.setMaterial(r);
		// 출력
		System.out.println(tdp.getMaterial().toString());
		System.out.println(tdpf.getMaterial().toString());
		System.out.println(tdpr.getMaterial().toString());
	}

}
