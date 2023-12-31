package com.songify.song.dto;

import org.springframework.http.HttpStatus;

public record SongDeleteResponseDto(String message, HttpStatus status) {
}
