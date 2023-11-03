/*
 * An XML document type.
 * Localname: redisponibilizaUltimaTransmissaoSelos
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one redisponibilizaUltimaTransmissaoSelos(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class RedisponibilizaUltimaTransmissaoSelosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosDocument
{
    private static final long serialVersionUID = 1L;
    
    public RedisponibilizaUltimaTransmissaoSelosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REDISPONIBILIZAULTIMATRANSMISSAOSELOS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "redisponibilizaUltimaTransmissaoSelos");
    
    
    /**
     * Gets the "redisponibilizaUltimaTransmissaoSelos" element
     */
    public br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelos getRedisponibilizaUltimaTransmissaoSelos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelos target = null;
            target = (br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelos)get_store().find_element_user(REDISPONIBILIZAULTIMATRANSMISSAOSELOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "redisponibilizaUltimaTransmissaoSelos" element
     */
    public void setRedisponibilizaUltimaTransmissaoSelos(br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelos redisponibilizaUltimaTransmissaoSelos)
    {
        generatedSetterHelperImpl(redisponibilizaUltimaTransmissaoSelos, REDISPONIBILIZAULTIMATRANSMISSAOSELOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "redisponibilizaUltimaTransmissaoSelos" element
     */
    public br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelos addNewRedisponibilizaUltimaTransmissaoSelos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelos target = null;
            target = (br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelos)get_store().add_element_user(REDISPONIBILIZAULTIMATRANSMISSAOSELOS$0);
            return target;
        }
    }
}
