/*NOMES: Thômas e Daniel
TURMA: 302 INFO

DAO: Interface para o CRUD.
 */
package persistencia;

public interface DAO {
    //Atributo create/adcionar
    public boolean inserir (Object obj);
    //Atributo read/pesquisar
    public Object pesquisar (Object obj);
    //Atributo update/atualizar
    public boolean editar (Object obj);
    //Atributo delete/deletar
    public boolean excluir (Object obj);
}
