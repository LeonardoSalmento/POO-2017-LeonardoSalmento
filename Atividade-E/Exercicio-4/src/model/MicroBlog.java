package model;

public class MicroBlog {
	public Postagem[] meuArray;
	int indice;	
	
	public MicroBlog(int tamanho){
		meuArray = new Postagem[tamanho];
		
	}
	
	public void adicionaPostagem(Postagem postagem){
		if(indice < meuArray.length){
			meuArray[indice] = postagem;
			indice++;
		}
	}
	
	public String excluirPostagem(int id){
		int aux = -1;
		for (int i = 0;i<indice;i++){
			if(meuArray[i].getId() == id){
				aux = i;
				break;
			}
		}
		if(aux != -1){
			Postagem[] arrayAux = new Postagem[meuArray.length];
			for(int i=0;i<indice-1;i++){
				if(i>= aux){
					arrayAux[i] = meuArray[i+1];
					
				}else{
					arrayAux[i] = meuArray[i];
				}
			}
			
			meuArray = arrayAux;
			indice--;
			return "Postagem excluida";
		}else{
			return "Id nao existe";
		}
	}
	
	public Postagem maisCurtida(){
		int aux=0;
		for (int i=0;i<indice;i++){
			if(meuArray[i].getQtdCurtidas()>aux){
				aux = i;
			}
		}
		return meuArray[aux];
	}
	
	public void curtir(int id){
		for(int i=0;i<indice;i++){
			if (meuArray[i].getId() == id){
				meuArray[i].curtir();
			}
		}
	}
	

}
