package com.songify.song.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record SongRequestDto(@NotNull(message = "songName cannot be null")
                             @NotEmpty(message = "songName cannot be empty")
                             String songName) {
}
