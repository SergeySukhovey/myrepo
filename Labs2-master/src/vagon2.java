public class vagon2 extends vagon {
    private int Mesta[];
    public void PustojVagon(int NomerVagona) {
        NomerEtogoVagona=NomerVagona;
        Mesta = new int[ChisloMest];
        for (int i=0;i<ChisloMest;i++) Mesta[i]=0;
        // 0 - free
    }

    public void IzmenitxChisloMest(int NovoeChisloMest){
        super.ChisloMest = NovoeChisloMest;
    }

    public void ZanyatxMesto(int NomerMesta) {
        if(Mesta[NomerMesta-1]==1)
            System.out.println("Eto mesto yje zanyato!: " + NomerMesta + " (vagon № " + NomerEtogoVagona+")");
        Mesta[NomerMesta-1]=1;
        // 1 - zanyato
    }

    public void VagonInfo() {
        System.out.println("Vagon №: " + NomerEtogoVagona);
        int CounMest = 0;
        for(int i = 0; i < ChisloMest; i++){
            if(Mesta[i]!=1)
                CounMest++;
        }
        System.out.println("Chislo svobodnih mest: " + CounMest);
        System.out.println("Informacia o svobodnyh mestax: ");
        for (int i=0;i<ChisloMest;i++)
            if (Mesta[i]==0) System.out.print((i+1)+" ");
        System.out.println("");
    }



}
