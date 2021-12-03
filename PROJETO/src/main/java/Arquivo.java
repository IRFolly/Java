
import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public void escrever(Jogador j1) {

        OutputStream os = null;
        OutputStreamWriter osr = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try {
            os = new FileOutputStream("Jogadores.txt", true); //salvar no arquivo
            osr = new OutputStreamWriter(os); //conversor
            bw = new BufferedWriter(osr); //o q vai digitar

            bw.write("Jogador");
            bw.newLine();
            bw.write(j1.getNome() + "\n");
            bw.write(j1.getCpf() + "\n");
            bw.write(j1.getIdade() + "\n");
            bw.write(j1.getEmail() + "\n");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public ArrayList<Jogador> ler() {

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        ArrayList<Jogador> acheiNoArquivo = new ArrayList<>();
        String linhaLer;

        try {

            is = new FileInputStream("Jogadores.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null) {
                if(linhaLer.contains("Jogador")) {
                    Jogador aux = new Jogador();
                    aux.setNome(br.readLine());
                    aux.setCpf(br.readLine());
                    aux.setIdade(Integer.parseInt(br.readLine()));
                    aux.setEmail(br.readLine());
                    acheiNoArquivo.add(aux);
                }
                linhaLer = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return acheiNoArquivo;
    }

}