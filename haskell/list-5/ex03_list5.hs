data Client = PessoaFisica String Int | PessoaJuridica String Int

obterNome :: Client -> String
obterNome (PessoaFisica name _) = name
obterNome (PessoaJuridica legalName _) = legalName