package com.bingoxwallet.token.entity;

import com.bingoxwallet.token.tools.TokenDefinition;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by James on 10/11/2018.
 * Bingobird in Korea
 */

public class FunctionDefinition
{
    public ContractInfo contract;
    public String method;
    public TokenDefinition.Syntax syntax;
    public As as;
    public List<MethodArg> parameters = new ArrayList<>();

    public String result;
    public long resultTime = 0;
    public BigInteger tokenId;
    public EthereumTransaction tx;
    public String namedTypeReturn;

    public int getTokenRequirement()
    {
        int count = 0;
        for (MethodArg arg : parameters)
        {
            if (arg.isTokenId()) count++;
        }

        if (count == 0) count = 1;

        return count;
    }
}
