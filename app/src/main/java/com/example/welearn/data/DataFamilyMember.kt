package com.example.welearn.data

import com.example.welearn.R
import com.example.welearn.model.FamilyMember

object DataFamilyMember {
    val familyMemberList = listOf(
        FamilyMember(R.string.relative_1, R.drawable.family_member_mom_and_son, R.raw.audio_family_member_mom),
        FamilyMember(R.string.relative_2, R.drawable.family_member_dad_and_son, R.raw.audio_family_member_dad),
        FamilyMember(R.string.relative_3, R.drawable.family_member_uncle, R.raw.audio_family_member_uncle),
        FamilyMember(R.string.relative_4, R.drawable.family_member_aunt, R.raw.audio_family_member_aunt),
        FamilyMember(R.string.relative_5, R.drawable.family_member_grandfather, R.raw.audio_family_member_grandfather),
        FamilyMember(R.string.relative_6, R.drawable.family_member_grandmother, R.raw.audio_family_member_grandmother)
    )
}