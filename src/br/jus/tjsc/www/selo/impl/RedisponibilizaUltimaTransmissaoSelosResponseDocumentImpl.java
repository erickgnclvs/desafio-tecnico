/*
 * An XML document type.
 * Localname: redisponibilizaUltimaTransmissaoSelosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one redisponibilizaUltimaTransmissaoSelosResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class RedisponibilizaUltimaTransmissaoSelosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RedisponibilizaUltimaTransmissaoSelosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REDISPONIBILIZAULTIMATRANSMISSAOSELOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "redisponibilizaUltimaTransmissaoSelosResponse");
    
    
    /**
     * Gets the "redisponibilizaUltimaTransmissaoSelosResponse" element
     */
    public br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponse getRedisponibilizaUltimaTransmissaoSelosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponse target = null;
            target = (br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponse)get_store().find_element_user(REDISPONIBILIZAULTIMATRANSMISSAOSELOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "redisponibilizaUltimaTransmissaoSelosResponse" element
     */
    public void setRedisponibilizaUltimaTransmissaoSelosResponse(br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponse redisponibilizaUltimaTransmissaoSelosResponse)
    {
        generatedSetterHelperImpl(redisponibilizaUltimaTransmissaoSelosResponse, REDISPONIBILIZAULTIMATRANSMISSAOSELOSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "redisponibilizaUltimaTransmissaoSelosResponse" element
     */
    public br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponse addNewRedisponibilizaUltimaTransmissaoSelosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponse target = null;
            target = (br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponse)get_store().add_element_user(REDISPONIBILIZAULTIMATRANSMISSAOSELOSRESPONSE$0);
            return target;
        }
    }
}
