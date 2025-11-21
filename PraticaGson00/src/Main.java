import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setLenient()
                .serializeNulls()
                .create();
        String json = """
                {
                "Nome": "Felipe",
                "Idade": 18,
                "Cidade": "Santo André"
                }""";

        try{
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);
        } catch(Exception x){
            System.out.println("Erro ao processar JSON: " + x.getMessage());
        }

        String jsonLivro = """
                {
                "Titulo": "Hábitos Atômicos",
                "Autor": "James Clear",
                "Editora":{
                "Nome": "Alta Books",
                "Regiao": "RJ/RJ"
                }
                }""";
        try{
            Livro livro = gson.fromJson(jsonLivro, Livro.class);
            System.out.println(livro);
        }catch (Exception x) {
            System.out.println("Erro ao processar JSON: " + x.getMessage());
        }

    }
}