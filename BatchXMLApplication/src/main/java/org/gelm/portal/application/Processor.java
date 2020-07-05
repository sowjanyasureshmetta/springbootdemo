package org.gelm.portal.application;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<Students, Students>
{
    @Override
    public Students process(Students item) throws Exception 
    {
    	Students st = item;
        return st;
    }

}