Criação de imagem no docker:

abrir o cmd em \Desafio\Desafio e executar o seguinte comando:

docker build -t desafio_justa .



após a build rodar a imagem a partir do seguinte código:

docker run -p 8080:8080 desafio_justa



após isso é possivel enviar um request com este formato:

http://localhost:8080/units/si?units=(degree/min)

recebendo o seguinte objeto json como resposta:

{
  "unit_name": "(rad/s)",
  "mutiplication_factor": 0.0002908882086657216
}