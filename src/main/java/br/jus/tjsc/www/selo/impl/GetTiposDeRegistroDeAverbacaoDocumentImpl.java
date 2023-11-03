/*
 * An XML document type.
 * Localname: getTiposDeRegistroDeAverbacao
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeRegistroDeAverbacao(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeRegistroDeAverbacaoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeRegistroDeAverbacaoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEREGISTRODEAVERBACAO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeRegistroDeAverbacao");
    
    
    /**
     * Gets the "getTiposDeRegistroDeAverbacao" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacao getGetTiposDeRegistroDeAverbacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacao target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacao)get_store().find_element_user(GETTIPOSDEREGISTRODEAVERBACAO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeRegistroDeAverbacao" element
     */
    public void setGetTiposDeRegistroDeAverbacao(br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacao getTiposDeRegistroDeAverbacao)
    {
        generatedSetterHelperImpl(getTiposDeRegistroDeAverbacao, GETTIPOSDEREGISTRODEAVERBACAO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeRegistroDeAverbacao" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacao addNewGetTiposDeRegistroDeAverbacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacao target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacao)get_store().add_element_user(GETTIPOSDEREGISTRODEAVERBACAO$0);
            return target;
        }
    }
}
