package com.ericg.paging3xml.data.remote.dto

import com.ericg.paging3xml.domain.model.Info
import com.ericg.paging3xml.domain.model.Character

data class RickMortyResponseDto(
    val info: InfoDto,
    val results: List<Character>
)