package com.songify.song.error;

import org.springframework.http.HttpStatus;

public record ErrorSongDeleteResponseDto(String message, HttpStatus httpStatus) {
}
