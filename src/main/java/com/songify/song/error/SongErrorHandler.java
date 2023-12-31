package com.songify.song.error;

import com.songify.song.controller.SongRestController;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Log4j2
@ControllerAdvice(assignableTypes = SongRestController.class)
public class SongErrorHandler {

    @ExceptionHandler(SongNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorSongDeleteResponseDto handleException(SongNotFoundException exception){
        log.warn("Error while deleting song");
        return new ErrorSongDeleteResponseDto(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

}
