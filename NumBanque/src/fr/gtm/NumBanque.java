package fr.gtm;
//un petit comm pr git
import java.math.BigInteger;

public class NumBanque {
public int num_banque;
public int code_etab;
public String num_compte;
public int rib;



public int concatCode(int num_banque,int code_etab,String num_compte, int rib) {
	String string_chiffre=Integer.toString(num_banque)+Integer.toString(code_etab)+num_compte+Integer.toString(rib);
BigInteger code_chiffre=new BigInteger(string_chiffre);
	if(code_chiffre%97==0 && code_chiffre.bitLength()==23) {
		return code_chiffre;
	}
	else {
		return 0;
	}
	
}


public static int bigSwitch(String mchar) {
	int newchar=11;
	switch(mchar){
	case "A": case "K": case "U": newchar=0; break;
	case "B": case "L": case "V": newchar=1; break;
	case "C": case "M": case "W": newchar=2; break;
	case "D": case "N": case "X": newchar=3; break;
	case "E": case "O": case "Y": newchar=4; break;
	case "F": case "P": case "Z": newchar=5; break;
	case "G": case "Q": newchar=6; break;
	case "H": case "R": newchar=7; break;
	case "I": case "S": newchar=8; break;
	case "J": case "T": newchar=9; break;
	}
	return newchar;
}



//transforme les lettres du num compte en chiffre
public String transfoChiffre(String num_compte) {
	String s_transforme="";
	for(int i=0; i<num_compte.length();i++) {
		if(num_compte.substring(i,i+1).getClass().getName()=="String") {
			
			s_transforme+=bigSwitch(num_compte.substring(i,i+1));
		}
		else {
			s_transforme+=num_compte.substring(i,i+1);
		}
	}
	//long transforme=Long.parseLong(s_transforme);
	//return transforme;
	return s_transforme;
}
//si le num compte est inférieur à 11 chiffres, mettre des 0 devant
public String verif11(String num_compte) {
	
		while(num_compte.length()<11) {
		num_compte="0"+num_compte;
		}
		return num_compte;
}
}
