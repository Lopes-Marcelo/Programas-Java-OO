public class Video implements AcoesVideo {

    //Atributos

    private String titulo;
    private int avaliacao;
    private int views;
    private int like;
    private boolean reproduzir;

    //Método Construtor

    public Video(String titulo){

        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.like = 0;
        this.reproduzir = false;
    }
    
    //Métodos Especiais 

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAvalicao(){
        return this.avaliacao;
    }

    public void setAvaliacao(int avaliacao){
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }
    
    public int getViews(){
        return this.views;
    }

    public void setViews(int views){
        this.views = views;
    }

    public int getLike(){
        return this.like;
    }

    public void setLike(int like){
        this.like = like;
    }

    public boolean getReproduzir(){
        return this.reproduzir;
    }

    public void setReproduzir(boolean reproduzir){
        this.reproduzir = reproduzir;
    }

    //Métodos Abstratos

    @Override
    public void play() {
        this.reproduzir = true;
    }

    @Override
    public void pause() {
        this.reproduzir = false;
    }

    @Override
    public void like() {
        setLike(getLike() + 1);
    }

    @Override
    public String toString(){
        return "Video - " + "Título: " + titulo + "\nAvaliação: " + avaliacao + "\nViews: " + views + "\nLikes: " + like + "\nReproduzindo: " + reproduzir;
        
    }
}
