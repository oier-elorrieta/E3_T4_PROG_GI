package kontrolatzaile.funtzioak;

import java.util.ArrayList;
import java.util.List;

import bista.Zinema;
import modeloa.Aldagaiak;
import modeloa.dao.AretoaDao;
import modeloa.dao.BezeroaDao;
import modeloa.dao.ErosketakDao;
import modeloa.dao.PelikulaDao;
import modeloa.dao.SaioaDao;
import modeloa.dao.SarreraDao;
import modeloa.dao.ZinemaAretoFilmaDAO;
import modeloa.dao.ZinemaDao;
import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Pelikula;

public class Funtzioak {
	
	public static void inicio() {
		objektuakHasieratu();
	}
	
	public static void objektuakHasieratu() {
		AretoaDao Aretoa = new AretoaDao();
		BezeroaDao Bezeroa = new BezeroaDao();
		ErosketakDao Erosketak = new ErosketakDao();
		PelikulaDao Pelikula = new PelikulaDao();
		SaioaDao Saioa = new SaioaDao();
		SarreraDao Sarrera = new SarreraDao();
		ZinemaDao Zinema = new ZinemaDao();
		ZinemaAretoFilmaDAO ZinemaAretoFilma = new ZinemaAretoFilmaDAO();
		
		List<Aretoa> areatoakList = new ArrayList<>();
		Aldagaiak.bezeroakListDao = new ArrayList<>();
		Aldagaiak.erosketakListDao = new ArrayList<>();
		Aldagaiak.pelikulakListDao = new ArrayList<>();
		Aldagaiak.saioakListDao = new ArrayList<>();
		Aldagaiak.sarrerakListDao = new ArrayList<>();
		Aldagaiak.zinemakListDao = new ArrayList<>();
		Aldagaiak.elorrietaPelikulak = new ArrayList<>();
		Aldagaiak.erandioPelikulak = new ArrayList<>();
		Aldagaiak.barakaldoPelikulak = new ArrayList<>();
		Aldagaiak.santutxuPelikulak = new ArrayList<>();
		Aldagaiak.basauriPelikulak = new ArrayList<>();

		Aldagaiak.areatoakListDao = Aretoa.lortuAreatoak();
		Aldagaiak.bezeroakListDao = Bezeroa.lortuBezeroak();
		Aldagaiak.erosketakListDao = Erosketak.lortuErosketak();
		Aldagaiak.pelikulakListDao = Pelikula.lortuPelikulak();
		Aldagaiak.saioakListDao = Saioa.lortuSaioak();
		Aldagaiak.sarrerakListDao = Sarrera.lortuSarrerak();
		Aldagaiak.zinemakListDao = Zinema.lortuZinemak();
		Aldagaiak.elorrietaPelikulak = ZinemaAretoFilma.lortuElorrietaFilmak();
		Aldagaiak.erandioPelikulak =  ZinemaAretoFilma.lortuErandioFilmak();
		Aldagaiak.barakaldoPelikulak =  ZinemaAretoFilma.lortuBarakaldoFilmak();
		Aldagaiak.santutxuPelikulak =   ZinemaAretoFilma.lortuSantutxuFilmak();
		Aldagaiak.basauriPelikulak =  ZinemaAretoFilma.lortuBasauriFilmak();
		
		
		
		System.out.println("\n\nAretoak:");
		for(int i = 0 ; i < Aldagaiak.areatoakListDao.size() ; i++) {
			System.out.println(Aldagaiak.areatoakListDao.get(i));
		}
		System.out.println("\n\nBezeroak:");
		for(int i = 0 ; i < Aldagaiak.bezeroakListDao.size() ; i++) {
			System.out.println(Aldagaiak.bezeroakListDao.get(i));
		}
		System.out.println("\n\nErosketa:");
		for(int i = 0 ; i < Aldagaiak.erosketakListDao.size() ; i++) {
			System.out.println(Aldagaiak.erosketakListDao.get(i));
		}
		System.out.println("\n\nPelikula:");
		for(int i = 0 ; i < Aldagaiak.pelikulakListDao.size() ; i++) {
			System.out.println(Aldagaiak.pelikulakListDao.get(i));
		}
//		System.out.println("\n\nSaioa:");
//		for(int i = 0 ; i < Aldagaiak.saioakListDao.size() ; i++) {
//			System.out.println(Aldagaiak.saioakListDao.get(i));
//		}
		System.out.println("\n\nSarrera:");
		for(int i = 0 ; i < Aldagaiak.sarrerakListDao.size() ; i++) {
			System.out.println(Aldagaiak.sarrerakListDao.get(i));
		}
		System.out.println("\n\nZinema:");
		for(int i = 0 ; i < Aldagaiak.zinemakListDao.size() ; i++) {
			System.out.println(Aldagaiak.zinemakListDao.get(i));
		}
		
		//  
		
		System.out.println("\n\nElorrietaFilmak:");
		for(int i = 0 ; i < Aldagaiak.elorrietaPelikulak.size() ; i++) {
			System.out.println(Aldagaiak.elorrietaPelikulak.get(i));
		}
		System.out.println("\n\nErandioFilmak:");
		for(int i = 0 ; i < Aldagaiak.erandioPelikulak.size() ; i++) {
			System.out.println(Aldagaiak.erandioPelikulak.get(i));
		}
		System.out.println("\n\nBasauriFilmak:");
		for(int i = 0 ; i < Aldagaiak.basauriPelikulak.size() ; i++) {
			System.out.println(Aldagaiak.basauriPelikulak.get(i));
		}
		System.out.println("\n\nSantutxuFilmak:");
		for(int i = 0 ; i < Aldagaiak.santutxuPelikulak.size() ; i++) {
			System.out.println(Aldagaiak.santutxuPelikulak.get(i));
		}
		System.out.println("\n\nBarakaldoFilmak:");
		for(int i = 0 ; i < Aldagaiak.barakaldoPelikulak.size() ; i++) {
			System.out.println(Aldagaiak.barakaldoPelikulak.get(i));
		}

	}
	
	public static void login() {
		if (loginOK()) {
			try {
				Zinema frame = new Zinema();
				frame.setVisible(true);
			} catch (Exception a) {
				a.printStackTrace();
			}
		}
	}
	
	public static boolean loginOK() {
		boolean login = true;
		//codigo
		return login;
	}
	
	public static void filmaDatuak() {
		Pelikula pelikula1 = new Pelikula(1,"CARS","KOMEDIA",120);
		Aldagaiak.izenaFilm = pelikula1.getIzena();
		Aldagaiak.generoFilm = pelikula1.getGeneroa();
		Aldagaiak.iraupenaFilm = pelikula1.getIraupena();
		Aldagaiak.urlFilmAux = Aldagaiak.urlFilm + Aldagaiak.izenaFilm + ".jpg";
		
	}
}
