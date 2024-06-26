package com.bingoxwallet.token.util;

import com.bingoxwallet.token.entity.NonFungibleToken;

import java.util.TimeZone;

/**
 * Created by James on 11/02/2019.
 * Bingobird in Korea
 */
class GeneralDateTime extends DateTime
{
    GeneralDateTime(NonFungibleToken.Attribute timeAttr)
    {
        this.timezone = TimeZone.getTimeZone("GMT");
        time = timeAttr.value.longValue()*1000;
    }

    GeneralDateTime(String time)
    {
        this.timezone = TimeZone.getTimeZone("GMT");
        Long timeConv = Long.valueOf(time);
        this.time = timeConv*1000;
    }
}
