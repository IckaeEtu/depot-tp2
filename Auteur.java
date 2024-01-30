public class Auteur{
    private String nom;
    private int point_trag;
    private String perf_trag;
    private int point_com;
    private String perf_com;
    private int point_dram;
    private String perf_dram;


    public Auteur(String nom,int point_trag,  String perf_trag, int point_com, String perf_com, int point_dram, String perf_dram){
        this.nom = nom;
        this.point_trag = point_trag;
        this.perf_trag = perf_trag;

        this.point_com = point_com;
        this.perf_com = perf_com;

        this.point_dram = point_dram;
        this.perf_dram = perf_dram;

    }

    public int getQualiteTragedie(){
        return this.point_trag;
    }

    public String getCitationTragedie(){
        return this.perf_trag;
    }

   public int getQualiteComedie(){
        return this.point_com;
    }

    public String getCitationComedie(){
        return this.perf_com;
    }

    public int getQualiteDrame(){
        return this.point_dram;
    }

    public String getCitationDrame(){
        return this.perf_dram;
    }

    @Override
    public String toString(){
        return "L'honorable " + this.nom;
    }
    
}