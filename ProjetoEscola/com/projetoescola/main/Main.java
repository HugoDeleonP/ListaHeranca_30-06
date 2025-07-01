package com.projetoescola.main;
import java.util.Scanner;

import com.projetoescola.model.*;
import com.projetoescola.service.*;
import com.projetoescola.view.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CadastroService manager = new CadastroService();
		Secretaria viewer = new Secretaria();
		
		int keyUser;
		
		do {
			keyUser = viewer.mainMenu();
			manager.managerUser(keyUser, viewer);
			}
		while(keyUser != 0);
		
		
	}

}
