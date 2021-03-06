package org.academiadecodigo.whiledlings.converters;

import org.academiadecodigo.whiledlings.commands.AnswerDTO;
import org.academiadecodigo.whiledlings.persistence.model.Answer;
import org.springframework.stereotype.Component;

@Component
public class AnswerDtoToAnswer implements Converter<Answer, AnswerDTO> {

    @Override
    public Answer convert(AnswerDTO answerDTO) {

        Answer answer = new Answer();
        answer.setAnswer(answerDTO.getAnswer());
        answer.setQuestion(answerDTO.getQuestion());

        return answer;
    }
}
