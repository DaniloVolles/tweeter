# Tweeter clone 
Sim, eu sei que o nome é twitter hahaha

### Motivo do projeto
Para implementar uma autenticação com Spring Security utilizando token JWT e OAUTH 2

# Importante
Necessário gerar chave privada e pública em ```src/main/resources```

1. Gerar chave privada

```bash
openssl genrsa > app.key
```

2. Gerar chave pública a partir da chave privada

```bash
openssl rsa -in app.key -pubout -out app.pub
```

