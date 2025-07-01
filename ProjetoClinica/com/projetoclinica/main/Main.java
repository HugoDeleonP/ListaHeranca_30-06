package com.projetoclinica.main;

import com.projetoclinica.service.*;
import com.projetoclinica.view.*;

public class Main {

	public static void main(String[] args) {
		Viewer viewer = new Viewer();
		CadastroService manager = new CadastroService();
		
		int keyUser = 0;
		
		do {
			keyUser =viewer.mainMenu();
			manager.managerUser(keyUser, viewer);
		} while(keyUser != 0);
		
		
	}

}
