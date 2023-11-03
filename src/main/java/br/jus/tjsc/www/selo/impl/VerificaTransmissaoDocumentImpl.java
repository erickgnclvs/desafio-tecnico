/*
 * An XML document type.
 * Localname: verificaTransmissao
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.VerificaTransmissaoDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one verificaTransmissao(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class VerificaTransmissaoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.VerificaTransmissaoDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerificaTransmissaoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERIFICATRANSMISSAO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "verificaTransmissao");
    
    
    /**
     * Gets the "verificaTransmissao" element
     */
    public br.jus.tjsc.www.selo.VerificaTransmissao getVerificaTransmissao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.VerificaTransmissao target = null;
            target = (br.jus.tjsc.www.selo.VerificaTransmissao)get_store().find_element_user(VERIFICATRANSMISSAO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verificaTransmissao" element
     */
    public void setVerificaTransmissao(br.jus.tjsc.www.selo.VerificaTransmissao verificaTransmissao)
    {
        generatedSetterHelperImpl(verificaTransmissao, VERIFICATRANSMISSAO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "verificaTransmissao" element
     */
    public br.jus.tjsc.www.selo.VerificaTransmissao addNewVerificaTransmissao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.VerificaTransmissao target = null;
            target = (br.jus.tjsc.www.selo.VerificaTransmissao)get_store().add_element_user(VERIFICATRANSMISSAO$0);
            return target;
        }
    }
}
