function AdicionarTarefa(){
    // recebe valor do imput do usuario 
    let inputTarefa = document.getElementById("inputTarefa")
    let tarefa = inputTarefa.value;

    // Validação do texto
    if (!validaTexto(tarefa, 3, 50)) {
        alert("A tarefa deve ter entre 3 e 50 caracteres e conter apenas letras e espaços.");
        return; // Interrompe a função se o texto for inválido
      }

    
    // aqui alimenta a lista de tarefas  

    let listaTarefas = document.getElementById("listaTarefas");
    let novaTarefa = document.createElement("li"); 
    novaTarefa.textContent = tarefa ; 
    listaTarefas.appendChild(novaTarefa);
    /// mostra mensagem na tela 
    let mensagem = "Tarefa Adicionada com Sucesso";
    document.getElementById("mensagem").textContent = mensagem;
    inputTarefa.value = "";
     
} 
function validaTexto(txt, min, max )
{
    const regex =/^[A-Za-z0-9\s]+$/;
    return txt.length >= min && txt.length <= max && regex.test(txt); 
}